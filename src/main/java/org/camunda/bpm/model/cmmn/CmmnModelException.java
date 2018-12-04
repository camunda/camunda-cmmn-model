/*
 * Copyright © 2014-2018 camunda services GmbH and various authors (info@camunda.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.model.cmmn;

import org.camunda.bpm.model.xml.ModelException;

/**
 * @author Roman Smirnov
 *
 */
public class CmmnModelException extends ModelException {

  private static final long serialVersionUID = 1L;

  public CmmnModelException() {
  }

  public CmmnModelException(String message, Throwable cause) {
    super(message, cause);
  }

  public CmmnModelException(String message) {
    super(message);
  }

  public CmmnModelException(Throwable cause) {
    super(cause);
  }

}
