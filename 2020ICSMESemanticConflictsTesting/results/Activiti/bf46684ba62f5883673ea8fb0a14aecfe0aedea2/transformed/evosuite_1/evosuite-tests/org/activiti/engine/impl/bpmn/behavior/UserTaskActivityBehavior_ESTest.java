/*
 * This file was automatically generated by EvoSuite
 * Mon May 25 23:35:11 GMT 2020
 */

package org.activiti.engine.impl.bpmn.behavior;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.activiti.bpmn.model.BaseElement;
import org.activiti.bpmn.model.EndEvent;
import org.activiti.bpmn.model.EventGateway;
import org.activiti.bpmn.model.ExclusiveGateway;
import org.activiti.bpmn.model.SendTask;
import org.activiti.bpmn.model.ServiceTask;
import org.activiti.bpmn.model.UserTask;
import org.activiti.engine.delegate.Expression;
import org.activiti.engine.delegate.TaskListener;
import org.activiti.engine.impl.bpmn.behavior.MailActivityBehavior;
import org.activiti.engine.impl.bpmn.behavior.SequentialMultiInstanceBehavior;
import org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior;
import org.activiti.engine.impl.bpmn.parser.BpmnParse;
import org.activiti.engine.impl.bpmn.parser.BpmnParser;
import org.activiti.engine.impl.bpmn.parser.factory.DefaultActivityBehaviorFactory;
import org.activiti.engine.impl.cfg.JtaProcessEngineConfiguration;
import org.activiti.engine.impl.el.FixedValue;
import org.activiti.engine.impl.el.JuelExpression;
import org.activiti.engine.impl.form.DefaultTaskFormHandler;
import org.activiti.engine.impl.form.TaskElContext;
import org.activiti.engine.impl.form.TaskFormHandler;
import org.activiti.engine.impl.history.parse.ProcessHistoryParseHandler;
import org.activiti.engine.impl.javax.el.ValueExpression;
import org.activiti.engine.impl.persistence.deploy.DeploymentManager;
import org.activiti.engine.impl.persistence.entity.ExecutionEntity;
import org.activiti.engine.impl.persistence.entity.IdentityLinkEntity;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.impl.persistence.entity.TaskEntity;
import org.activiti.engine.impl.pvm.delegate.ActivityExecution;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl;
import org.activiti.engine.impl.pvm.process.TransitionImpl;
import org.activiti.engine.impl.pvm.runtime.AtomicOperationTransitionNotifyListenerTake;
import org.activiti.engine.impl.pvm.runtime.ExecutionImpl;
import org.activiti.engine.impl.task.TaskDefinition;
import org.activiti.engine.impl.webservice.WSOperation;
import org.activiti.engine.impl.webservice.WSService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UserTaskActivityBehavior_ESTest extends UserTaskActivityBehavior_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      String string0 = null;
      TaskEntity taskEntity0 = new TaskEntity(string0);
      TaskDefinition taskDefinition0 = taskEntity0.getTaskDefinition();
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior(taskDefinition0);
      List<String> list0 = userTaskActivityBehavior0.extractCandidates(taskEntity0.DELETE_REASON_DELETED);
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior();
      BpmnParser bpmnParser0 = new BpmnParser();
      BpmnParse bpmnParse0 = new BpmnParse(bpmnParser0);
      String string0 = "}}CR0nB3*&";
      BpmnParse bpmnParse1 = bpmnParse0.name(string0);
      ActivityImpl activityImpl0 = bpmnParse1.getCurrentActivity();
      String string1 = "$_";
      String string2 = "";
      WSService wSService0 = new WSService(bpmnParse0.PROPERTYNAME_CONDITION_TEXT, bpmnParser0.BPMN_DI_NS, string2);
      WSOperation wSOperation0 = new WSOperation(string1, bpmnParse1.PROPERTYNAME_INITIATOR_VARIABLE_NAME, wSService0);
      bpmnParse1.addOperation(wSOperation0);
      ExecutionEntity executionEntity0 = new ExecutionEntity(activityImpl0);
      try { 
        userTaskActivityBehavior0.signal(executionEntity0, bpmnParse1.PROPERTYNAME_COMPENSATION_HANDLER_ID, bpmnParse1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.entity.ExecutionEntity", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior();
      TaskDefinition taskDefinition0 = userTaskActivityBehavior0.getTaskDefinition();
      String string0 = "$Ho";
      TaskEntity taskEntity0 = new TaskEntity(string0);
      ProcessHistoryParseHandler processHistoryParseHandler0 = new ProcessHistoryParseHandler();
      BpmnParser bpmnParser0 = new BpmnParser();
      BpmnParse bpmnParse0 = new BpmnParse(bpmnParser0);
      EventGateway eventGateway0 = new EventGateway();
      ProcessDefinitionImpl processDefinitionImpl0 = new ProcessDefinitionImpl(bpmnParse0.PROPERTYNAME_CONDITION);
      ActivityImpl activityImpl0 = new ActivityImpl(bpmnParse0.PROPERTYNAME_CONDITION_TEXT, processDefinitionImpl0);
      FixedValue fixedValue0 = new FixedValue(string0);
      processDefinitionImpl0.setProperty(bpmnParse0.PROPERTYNAME_ISEXPANDED, fixedValue0);
      ActivityImpl activityImpl1 = AtomicOperationTransitionNotifyListenerTake.findNextScope(processDefinitionImpl0, activityImpl0);
      ActivityImpl activityImpl2 = processHistoryParseHandler0.createActivityOnScope(bpmnParse0, eventGateway0, bpmnParse0.PROPERTYNAME_START_TIMER, activityImpl1);
      ExecutionImpl executionImpl0 = new ExecutionImpl(activityImpl2);
      String string1 = "c";
      ExecutionImpl executionImpl1 = executionImpl0.findExecution(string1);
      // Undeclared exception!
      try { 
        userTaskActivityBehavior0.handleAssignments(taskEntity0, executionImpl1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior();
      JtaProcessEngineConfiguration jtaProcessEngineConfiguration0 = new JtaProcessEngineConfiguration();
      DeploymentManager deploymentManager0 = jtaProcessEngineConfiguration0.getDeploymentManager();
      String string0 = "";
      ProcessDefinitionEntity processDefinitionEntity0 = new ProcessDefinitionEntity();
      // Undeclared exception!
      try { 
        processDefinitionEntity0.addIdentityLink(jtaProcessEngineConfiguration0.DB_SCHEMA_UPDATE_DROP_CREATE, jtaProcessEngineConfiguration0.DEFAULT_MYBATIS_MAPPING_FILE);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      DefaultTaskFormHandler defaultTaskFormHandler0 = new DefaultTaskFormHandler();
      TaskDefinition taskDefinition0 = new TaskDefinition(defaultTaskFormHandler0);
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior(taskDefinition0);
      TaskDefinition taskDefinition1 = userTaskActivityBehavior0.getTaskDefinition();
      TaskEntity taskEntity0 = null;
      ActivityExecution activityExecution0 = null;
      userTaskActivityBehavior0.handleAssignments(taskEntity0, activityExecution0);
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      DefaultTaskFormHandler defaultTaskFormHandler0 = new DefaultTaskFormHandler();
      TaskDefinition taskDefinition0 = new TaskDefinition(defaultTaskFormHandler0);
      taskDefinition0.setTaskFormHandler(defaultTaskFormHandler0);
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior(taskDefinition0);
      TaskEntity taskEntity0 = null;
      ProcessHistoryParseHandler processHistoryParseHandler0 = new ProcessHistoryParseHandler();
      BpmnParser bpmnParser0 = new BpmnParser();
      BpmnParse bpmnParse0 = new BpmnParse(bpmnParser0);
      DefaultActivityBehaviorFactory defaultActivityBehaviorFactory0 = new DefaultActivityBehaviorFactory();
      ServiceTask serviceTask0 = new ServiceTask();
      MailActivityBehavior mailActivityBehavior0 = defaultActivityBehaviorFactory0.createMailActivityBehavior(serviceTask0);
      Expression expression0 = mailActivityBehavior0.textVar;
      taskDefinition0.setFormKeyExpression(expression0);
      EndEvent endEvent0 = new EndEvent();
      List<String> list0 = userTaskActivityBehavior0.extractCandidates(bpmnParse0.PROPERTYNAME_EVENT_SUBSCRIPTION_DECLARATION);
      Set<Class<? extends BaseElement>> set0 = processHistoryParseHandler0.getHandledTypes();
      // Undeclared exception!
      try { 
        processHistoryParseHandler0.createActivityOnCurrentScope(bpmnParse0, endEvent0, bpmnParser0.BPMN_DI_NS);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.bpmn.parser.handler.AbstractBpmnParseHandler", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior();
      ExecutionImpl executionImpl0 = new ExecutionImpl();
      ExecutionImpl executionImpl1 = executionImpl0.createExecution();
      List<String> list0 = executionImpl1.findActiveActivityIds();
      try { 
        userTaskActivityBehavior0.execute(executionImpl1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.entity.TaskEntity", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior();
      ActivityExecution activityExecution0 = null;
      try { 
        userTaskActivityBehavior0.execute(activityExecution0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.entity.TaskEntity", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      String string0 = "aqJRMP@zH[Mc9";
      TaskEntity taskEntity0 = new TaskEntity(string0);
      String string1 = "Expression did not resolve to a string or collection of strings";
      taskEntity0.forceUpdate();
      taskEntity0.setOwnerWithoutCascade(string1);
      TaskDefinition taskDefinition0 = taskEntity0.getTaskDefinition();
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior(taskDefinition0);
      TaskDefinition taskDefinition1 = userTaskActivityBehavior0.getTaskDefinition();
      ProcessHistoryParseHandler processHistoryParseHandler0 = new ProcessHistoryParseHandler();
      BpmnParser bpmnParser0 = new BpmnParser();
      BpmnParse bpmnParse0 = new BpmnParse(bpmnParser0);
      SendTask sendTask0 = new SendTask();
      String string2 = "";
      ProcessDefinitionImpl processDefinitionImpl0 = new ProcessDefinitionImpl(taskEntity0.DELETE_REASON_DELETED);
      ActivityImpl activityImpl0 = processHistoryParseHandler0.createActivityOnScope(bpmnParse0, sendTask0, string2, processDefinitionImpl0);
      ExecutionImpl executionImpl0 = new ExecutionImpl(activityImpl0);
      try { 
        userTaskActivityBehavior0.signal(executionImpl0, string0, taskEntity0);
      } catch(ClassCastException e) {
         //
         // org.activiti.engine.impl.pvm.runtime.ExecutionImpl cannot be cast to org.activiti.engine.impl.persistence.entity.ExecutionEntity
         //
         verifyException("org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      TaskDefinition taskDefinition0 = null;
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior(taskDefinition0);
      DefaultTaskFormHandler defaultTaskFormHandler0 = new DefaultTaskFormHandler();
      TaskDefinition taskDefinition1 = new TaskDefinition(defaultTaskFormHandler0);
      userTaskActivityBehavior0.taskDefinition = taskDefinition1;
      String string0 = null;
      // Undeclared exception!
      try { 
        userTaskActivityBehavior0.extractCandidates(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      TaskFormHandler taskFormHandler0 = null;
      TaskDefinition taskDefinition0 = new TaskDefinition(taskFormHandler0);
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior(taskDefinition0);
      DefaultActivityBehaviorFactory defaultActivityBehaviorFactory0 = new DefaultActivityBehaviorFactory();
      UserTask userTask0 = new UserTask();
      UserTask userTask1 = userTask0.clone();
      UserTaskActivityBehavior userTaskActivityBehavior1 = defaultActivityBehaviorFactory0.createUserTaskActivityBehavior(userTask1, taskDefinition0);
      ServiceTask serviceTask0 = new ServiceTask();
      String string0 = ")I&F-,PdMj'-r";
      serviceTask0.setId(string0);
      MailActivityBehavior mailActivityBehavior0 = defaultActivityBehaviorFactory0.createMailActivityBehavior(serviceTask0);
      Expression expression0 = mailActivityBehavior0.charset;
      taskDefinition0.addCandidateUserIdExpression(expression0);
      String string1 = "";
      TaskEntity taskEntity0 = new TaskEntity(string1);
      ExecutionEntity executionEntity0 = taskEntity0.getProcessInstance();
      // Undeclared exception!
      try { 
        userTaskActivityBehavior0.handleAssignments(taskEntity0, executionEntity0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior", e);
      }
  }
}
