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
package org.camunda.bpm.model.cmmn.impl;

/**
 * @author Roman Smirnov
 *
 */
public class CmmnModelConstants {

  /** The CMMN 1.0 namespace */
  public static final String CMMN10_NS = "http://www.omg.org/spec/CMMN/20131201/MODEL";

  /** The location of the CMMN 1.0 XML schema. */
  public static final String CMMN_10_SCHEMA_LOCATION = "CMMN10.xsd";

  /** Xml Schema is the default type language */
  public static final String XML_SCHEMA_NS = "http://www.w3.org/2001/XMLSchema";

  public static final String XPATH_NS = "http://www.w3.org/1999/XPath";

  // elements ///////////////////////////////////////////////////////////////////////////

  public static final String CMMN_ELEMENT = "cmmnElement";
  public static final String CMMN_ELEMENT_DEFINITIONS = "definitions";
  public static final String CMMN_ELEMENT_IMPORT = "import";

  // case
  public static final String CMMN_ELEMENT_CASE = "case";
  public static final String CMMN_ELEMENT_CASE_FILE_MODEL = "caseFileModel";
  public static final String CMMN_ELEMENT_CASE_PLAN_MODEL = "casePlanModel";

  // roles
  public static final String CMMN_ELEMENT_ROLE = "role";
  public static final String CMMN_ELEMENT_CASE_ROLE = "caseRole";
  public static final String CMMN_ELEMENT_CASE_ROLES = "caseRoles";

  // rules
  public static final String CMMN_ELEMENT_REPETITION_RULE = "repetitionRule";
  public static final String CMMN_ELEMENT_REQUIRED_RULE = "requiredRule";
  public static final String CMMN_ELEMENT_MANUAL_ACTIVATION_RULE = "manualActivationRule";
  public static final String CMMN_ELEMENT_APPLICABILITY_RULE= "applicabilityRule";

  // expression
  public static final String CMMN_ELEMENT_EXPRESSION = "expression";
  public static final String CMMN_ELEMENT_BODY = "body";
  public static final String CMMN_ELEMENT_CONDITION = "condition";
  public static final String CMMN_ELEMENT_BINDING_REFINEMENT = "bindingRefinement";
  public static final String CMMN_ELEMENT_TRANSFORMATION = "transformation";
  public static final String CMMN_ELEMENT_TIMER_EXPRESSION = "timerExpression";

  // case file
  public static final String CMMN_ELEMENT_CASE_FILE = "caseFile";
  public static final String CMMN_ELEMENT_CASE_FILE_ITEM = "caseFileItem";
  public static final String CMMN_ELEMENT_CASE_FILE_ITEM_DEFINITION = "caseFileItemDefinition";
  public static final String CMMN_ELEMENT_CHILDREN = "children";

  // plan item control
  public static final String CMMN_ELEMENT_PLAN_ITEM_CONTROL = "planItemControl";
  public static final String CMMN_ELEMENT_DEFAULT_CONTROL = "defaultControl";

  // plan item definitions
  public static final String CMMN_ELEMENT_PLAN_ITEM_DEFINITION = "planItemDefinition";
  // tasks
  public static final String CMMN_ELEMENT_TASK = "task";
  public static final String CMMN_ELEMENT_HUMAN_TASK = "humanTask";
  public static final String CMMN_ELEMENT_PROCESS_TASK = "processTask";
  public static final String CMMN_ELEMENT_CASE_TASK = "caseTask";
  // events
  public static final String CMMN_ELEMENT_EVENT = "event";
  public static final String CMMN_ELEMENT_USER_EVENT = "userEvent";
  public static final String CMMN_ELEMENT_TIMER_EVENT = "timerEvent";
  // milestones
  public static final String CMMN_ELEMENT_MILESTONE = "milestone";
  // plan fragment
  public static final String CMMN_ELEMENT_PLAN_FRAGMENT = "planFragment";
  // stage
  public static final String CMMN_ELEMENT_STAGE = "stage";

  // plan item
  public static final String CMMN_ELEMENT_PLAN_ITEM = "planItem";

  // table items
  public static final String CMMN_ELEMENT_TABLE_ITEM = "tableItem";
  public static final String CMMN_ELEMENT_PLANNING_TABLE = "planningTable";
  public static final String CMMN_ELEMENT_DISCRETIONARY_ITEM = "discretionaryItem";

  // start trigger
  public static final String CMMN_ELEMENT_TIMER_START = "timerStart";
  public static final String CMMN_ELEMENT_CASE_FILE_ITEM_START_TRIGGER = "caseFileItemStartTrigger";
  public static final String CMMN_ELEMENT_PLAN_ITEM_START_TRIGGER = "planItemStartTrigger";

  // sentrys
  public static final String CMMN_ELEMENT_SENTRY = "sentry";
  public static final String CMMN_ELEMENT_STANDARD_EVENT = "standardEvent";
  public static final String CMMN_ELEMENT_ON_PART = "onPart";
  public static final String CMMN_ELEMENT_CASE_FILE_ITEM_ON_PART = "caseFileItemOnPart";
  public static final String CMMN_ELEMENT_PLAN_ITEM_ON_PART = "planItemOnPart";
  public static final String CMMN_ELEMENT_IF_PART = "ifPart";

  // parameter
  public static final String CMMN_ELEMENT_PARAMETER = "parameter";
  public static final String CMMN_ELEMENT_CASE_PARAMETER = "caseParameter";
  public static final String CMMN_ELEMENT_PROCESS_PARAMETER = "processParameter";
  public static final String CMMN_ELEMENT_INPUT = "input";
  public static final String CMMN_ELEMENT_INPUTS = "inputs";
  public static final String CMMN_ELEMENT_OUTPUT = "output";
  public static final String CMMN_ELEMENT_OUTPUTS = "outputs";
  public static final String CMMN_ELEMENT_PARAMETER_MAPPING = "parameterMapping";

  // property
  public static final String CMMN_ELEMENT_PROPERTY = "property";

  // process
  public static final String CMMN_ELEMENT_PROCESS = "process";

  // attributes /////////////////////////////////////////////////////////////////////////

  public static final String CMMN_ATTRIBUTE_ID = "id";
  public static final String CMMN_ATTRIBUTE_DESCRIPTION = "description";
  public static final String CMMN_ATTRIBUTE_NAME = "name";
  public static final String CMMN_ATTRIBUTE_TYPE = "type";
  public static final String CMMN_ATTRIBUTE_TARGET_NAMESPACE = "targetNamespace";
  public static final String CMMN_ATTRIBUTE_EXPRESSION_LANGUAGE = "expressionLanguage";
  public static final String CMMN_ATTRIBUTE_EXPORTER = "exporter";
  public static final String CMMN_ATTRIBUTE_EXPORTER_VERSION = "exporterVersion";
  public static final String CMMN_ATTRIBUTE_AUTHOR = "author";
  public static final String CMMN_ATTRIBUTE_CREATION_DATE = "creationDate";
  public static final String CMMN_ATTRIBUTE_LOCATION = "location";
  public static final String CMMN_ATTRIBUTE_NAMESPACE = "namespace";
  public static final String CMMN_ATTRIBUTE_IMPORT_TYPE = "importType";
  public static final String CMMN_ATTRIBUTE_MULTIPLICITY = "multiplicity";
  public static final String CMMN_ATTRIBUTE_DEFINITION_REF = "definitionRef";
  public static final String CMMN_ATTRIBUTE_SOURCE_REF = "sourceRef";
  public static final String CMMN_ATTRIBUTE_TARGET_REFS = "targetRefs";
  public static final String CMMN_ATTRIBUTE_DEFINITION_TYPE = "definitionType";
  public static final String CMMN_ATTRIBUTE_STRUCTURE_REF = "structureRef";
  public static final String CMMN_ATTRIBUTE_IMPORT_REF = "importRef";
  public static final String CMMN_ATTRIBUTE_LANGUAGE = "language";
  public static final String CMMN_ATTRIBUTE_IS_BLOCKING = "isBlocking";
  public static final String CMMN_ATTRIBUTE_BINDING_REF= "bindingRef";
  public static final String CMMN_ATTRIBUTE_PERFORMER_REF = "performerRef";
  public static final String CMMN_ATTRIBUTE_PROCESS_REF = "processRef";
  public static final String CMMN_ATTRIBUTE_IMPLEMENTATION_TYPE = "implementationType";
  public static final String CMMN_ATTRIBUTE_CASE_REF = "caseRef";
  public static final String CMMN_ATTRIBUTE_TARGET_REF = "targetRef";
  public static final String CMMN_ATTRIBUTE_SENTRY_REF = "sentryRef";
  public static final String CMMN_ATTRIBUTE_CONTEXT_REF = "contextRef";
  public static final String CMMN_ATTRIBUTE_AUTO_COMPLETE = "autoComplete";
  public static final String CMMN_ATTRIBUTE_ENTRY_CRITERIA_REFS = "entryCriteriaRefs";
  public static final String CMMN_ATTRIBUTE_EXIT_CRITERIA_REFS = "exitCriteriaRefs";
  public static final String CMMN_ATTRIBUTE_APPLICABILITY_RULE_REFS = "applicabilityRuleRefs";
  public static final String CMMN_ATTRIBUTE_AUTHORIZED_ROLE_REFS = "authorizedRoleRefs";

}
