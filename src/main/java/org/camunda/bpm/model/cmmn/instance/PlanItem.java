/*
 * Copyright © 2014 - 2018 camunda services GmbH and various authors (info@camunda.com)
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
package org.camunda.bpm.model.cmmn.instance;

import java.util.Collection;

/**
 * @author Roman Smirnov
 *
 */
public interface PlanItem extends CmmnElement {

  String getName();

  void setName(String name);

  PlanItemDefinition getDefinition();

  void setDefinition(PlanItemDefinition definition);

  @Deprecated
  Collection<Sentry> getEntryCriterias();

  @Deprecated
  Collection<Sentry> getExitCriterias();

  /**
   * @return an immutable collection
   */
  Collection<Sentry> getEntryCriteria();

  /**
   * @return an immutable collection
   */
  Collection<Sentry> getExitCriteria();

  Collection<EntryCriterion> getEntryCriterions();

  Collection<ExitCriterion> getExitCriterions();

  ItemControl getItemControl();

  void setItemControl(ItemControl itemControl);


}
