/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.zab;

import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A base class for all the test cases.
 */
public class TestBase {
  private static final Logger LOG = LoggerFactory.getLogger(TestBase.class);

  /**
   * Logs the beginning and the end of the each test method.
   */
  @Rule
  public TestWatcher watchman= new TestWatcher() {
    @Override
    protected void starting(Description description) {
      LOG.info("STARTING: {}", description);
    }

    @Override
    protected void failed(Throwable e, Description description) {
      LOG.error("FAILED: {}", description, e);
    }

    @Override
    protected void succeeded(Description description) {
      LOG.info("SUCCEEDED: {}", description);
    }
  };
}