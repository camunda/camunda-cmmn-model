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
package org.camunda.bpm.model.cmmn.impl.instance;

import static org.camunda.bpm.model.cmmn.impl.CmmnModelConstants.CMMN10_NS;
import static org.camunda.bpm.model.cmmn.impl.CmmnModelConstants.CMMN_ATTRIBUTE_DEFINITION_REF;
import static org.camunda.bpm.model.cmmn.impl.CmmnModelConstants.CMMN_ELEMENT_DISCRETIONARY_ITEM;

import org.camunda.bpm.model.cmmn.instance.DiscretionaryItem;
import org.camunda.bpm.model.cmmn.instance.PlanItemControl;
import org.camunda.bpm.model.cmmn.instance.PlanItemDefinition;
import org.camunda.bpm.model.cmmn.instance.TableItem;
import org.camunda.bpm.model.xml.ModelBuilder;
import org.camunda.bpm.model.xml.impl.instance.ModelTypeInstanceContext;
import org.camunda.bpm.model.xml.type.ModelElementTypeBuilder;
import org.camunda.bpm.model.xml.type.ModelElementTypeBuilder.ModelTypeInstanceProvider;
import org.camunda.bpm.model.xml.type.child.ChildElement;
import org.camunda.bpm.model.xml.type.child.SequenceBuilder;
import org.camunda.bpm.model.xml.type.reference.AttributeReference;

/**
 * @author Roman Smirnov
 *
 */
public class DiscretionaryItemImpl extends TableItemImpl implements DiscretionaryItem {

  protected static AttributeReference<PlanItemDefinition> definitionRefAttribute;
  protected static ChildElement<PlanItemControl> itemControlChild;

  public DiscretionaryItemImpl(ModelTypeInstanceContext instanceContext) {
    super(instanceContext);
  }

  public PlanItemDefinition getDefinition() {
    return definitionRefAttribute.getReferenceTargetElement(this);
  }

  public void setDefinition(PlanItemDefinition definition) {
    definitionRefAttribute.setReferenceTargetElement(this, definition);
  }

  public PlanItemControl getItemControl() {
    return itemControlChild.getChild(this);
  }

  public void setItemControl(PlanItemControl itemControl) {
    itemControlChild.setChild(this, itemControl);
  }

  public static void registerType(ModelBuilder modelBuilder) {
    ModelElementTypeBuilder typeBuilder = modelBuilder.defineType(DiscretionaryItem.class, CMMN_ELEMENT_DISCRETIONARY_ITEM)
        .namespaceUri(CMMN10_NS)
        .extendsType(TableItem.class)
        .instanceProvider(new ModelTypeInstanceProvider<DiscretionaryItem>() {
          public DiscretionaryItem newInstance(ModelTypeInstanceContext instanceContext) {
            return new DiscretionaryItemImpl(instanceContext);
          }
        });

    definitionRefAttribute = typeBuilder.stringAttribute(CMMN_ATTRIBUTE_DEFINITION_REF)
        .idAttributeReference(PlanItemDefinition.class)
        .build();

    SequenceBuilder sequenceBuilder = typeBuilder.sequence();

    itemControlChild = sequenceBuilder.element(PlanItemControl.class)
        .build();

    typeBuilder.build();
  }

}
