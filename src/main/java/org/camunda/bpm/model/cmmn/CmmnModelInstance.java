/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.model.cmmn;

import org.camunda.bpm.model.cmmn.instance.Definitions;
import org.camunda.bpm.model.xml.ModelInstance;

/**
 * @author Roman Smirnov
 *
 */
public interface CmmnModelInstance extends ModelInstance {

  /**
   * @return the {@link Definitions}, root element of the Cmmn Model.
   * */
  Definitions getDefinitions();

  /**
   * Set the Cmmn Definitions Root element
   * @param definitions the {@link Definitions} element to set
   * */
  void setDefinitions(Definitions definitions);

}
