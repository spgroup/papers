/*
 * This file was automatically generated by EvoSuite
 * Tue May 26 00:08:27 GMT 2020
 */

package org.activiti.engine.impl.bpmn.behavior;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import javax.script.SimpleBindings;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.bpmn.model.EventGateway;
import org.activiti.bpmn.model.GraphicInfo;
import org.activiti.bpmn.model.ServiceTask;
import org.activiti.engine.delegate.ExecutionListener;
import org.activiti.engine.delegate.Expression;
import org.activiti.engine.delegate.TaskListener;
import org.activiti.engine.impl.RepositoryServiceImpl;
import org.activiti.engine.impl.bpmn.behavior.BpmnActivityBehavior;
import org.activiti.engine.impl.bpmn.behavior.MailActivityBehavior;
import org.activiti.engine.impl.bpmn.behavior.SequentialMultiInstanceBehavior;
import org.activiti.engine.impl.bpmn.behavior.ShellActivityBehavior;
import org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior;
import org.activiti.engine.impl.bpmn.listener.DelegateExpressionExecutionListener;
import org.activiti.engine.impl.bpmn.parser.BpmnParse;
import org.activiti.engine.impl.bpmn.parser.BpmnParser;
import org.activiti.engine.impl.bpmn.parser.FieldDeclaration;
import org.activiti.engine.impl.bpmn.parser.factory.DefaultActivityBehaviorFactory;
import org.activiti.engine.impl.el.ActivitiElContext;
import org.activiti.engine.impl.el.ExpressionManager;
import org.activiti.engine.impl.el.JuelExpression;
import org.activiti.engine.impl.form.DefaultStartFormHandler;
import org.activiti.engine.impl.form.DefaultTaskFormHandler;
import org.activiti.engine.impl.form.TaskElContext;
import org.activiti.engine.impl.form.TaskFormHandler;
import org.activiti.engine.impl.form.TaskVariableMapper;
import org.activiti.engine.impl.history.parse.ProcessHistoryParseHandler;
import org.activiti.engine.impl.javax.el.ELContext;
import org.activiti.engine.impl.javax.el.ELResolver;
import org.activiti.engine.impl.javax.el.ExpressionFactory;
import org.activiti.engine.impl.javax.el.FunctionMapper;
import org.activiti.engine.impl.javax.el.ValueExpression;
import org.activiti.engine.impl.javax.el.VariableMapper;
import org.activiti.engine.impl.juel.Bindings;
import org.activiti.engine.impl.juel.Builder;
import org.activiti.engine.impl.juel.Cache;
import org.activiti.engine.impl.juel.ObjectValueExpression;
import org.activiti.engine.impl.juel.TreeStore;
import org.activiti.engine.impl.juel.TreeValueExpression;
import org.activiti.engine.impl.juel.TypeConverterImpl;
import org.activiti.engine.impl.persistence.deploy.DeploymentManager;
import org.activiti.engine.impl.persistence.entity.ExecutionEntity;
import org.activiti.engine.impl.persistence.entity.HistoricProcessInstanceEntity;
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
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UserTaskActivityBehavior_ESTest extends UserTaskActivityBehavior_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      List<String> list0 = null;
      BpmnActivityBehavior bpmnActivityBehavior0 = null;
      TaskListener taskListener0 = null;
      ActivityExecution activityExecution0 = null;
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior();
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
  public void test01()  throws Throwable  {
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior();
      TaskDefinition taskDefinition0 = userTaskActivityBehavior0.getTaskDefinition();
      String string0 = null;
      ProcessDefinitionEntity processDefinitionEntity0 = new ProcessDefinitionEntity();
      ActivityImpl activityImpl0 = new ActivityImpl(string0, processDefinitionEntity0);
      ActivityImpl activityImpl1 = activityImpl0.getParentActivity();
      ExecutionImpl executionImpl0 = new ExecutionImpl(activityImpl1);
      ActivityImpl activityImpl2 = null;
      SequentialMultiInstanceBehavior sequentialMultiInstanceBehavior0 = new SequentialMultiInstanceBehavior(activityImpl2, userTaskActivityBehavior0);
      userTaskActivityBehavior0.setMultiInstanceActivityBehavior(sequentialMultiInstanceBehavior0);
      int int0 = (-3203);
      Integer integer0 = new Integer(int0);
      String string1 = "selectHistoricProcessInstanceByNativeQuery_mssql_or_db2";
      int int1 = (-2817);
      int int2 = Integer.max(int1, int1);
      Integer integer1 = Integer.getInteger(string1, int0);
      Integer integer2 = Integer.getInteger(string0, int1);
      try { 
        userTaskActivityBehavior0.signal(executionImpl0, string0, integer0);
      } catch(ClassCastException e) {
         //
         // org.activiti.engine.impl.pvm.runtime.ExecutionImpl cannot be cast to org.activiti.engine.impl.persistence.entity.ExecutionEntity
         //
         verifyException("org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      IdentityLinkEntity identityLinkEntity0 = new IdentityLinkEntity();
      ExecutionEntity executionEntity0 = new ExecutionEntity();
      double double0 = (-2954.4298566936127);
      Double double1 = new Double(double0);
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      DefaultTaskFormHandler defaultTaskFormHandler0 = new DefaultTaskFormHandler();
      TaskDefinition taskDefinition0 = new TaskDefinition(defaultTaskFormHandler0);
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior(taskDefinition0);
      TaskEntity taskEntity0 = new TaskEntity();
      ExecutionImpl executionImpl0 = new ExecutionImpl();
      boolean boolean0 = true;
      Expression expression0 = null;
      taskDefinition0.setPriorityExpression(expression0);
      String string0 = "f~,ogeM24\"\\z$";
      Object object0 = new Object();
      executionImpl0.inactivate();
      taskDefinition0.addCandidateUserIdExpression(expression0);
      List<String> list0 = userTaskActivityBehavior0.extractCandidates(taskEntity0.DELETE_REASON_DELETED);
      TaskDefinition taskDefinition1 = userTaskActivityBehavior0.getTaskDefinition();
      List<ExecutionImpl> list1 = null;
      executionImpl0.setExecutions(list1);
      TaskDefinition taskDefinition2 = userTaskActivityBehavior0.getTaskDefinition();
      TaskDefinition taskDefinition3 = userTaskActivityBehavior0.getTaskDefinition();
      taskEntity0.setExecutionId(string0);
      // Undeclared exception!
      try { 
        userTaskActivityBehavior0.handleAssignments(taskEntity0, executionImpl0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      DefaultTaskFormHandler defaultTaskFormHandler0 = new DefaultTaskFormHandler();
      TaskDefinition taskDefinition0 = new TaskDefinition(defaultTaskFormHandler0);
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior(taskDefinition0);
      TaskEntity taskEntity0 = new TaskEntity();
      ExecutionImpl executionImpl0 = new ExecutionImpl();
      boolean boolean0 = true;
      Expression expression0 = null;
      taskDefinition0.setPriorityExpression(expression0);
      String string0 = "f~,ogeM24\"\\z$";
      Object object0 = new Object();
      executionImpl0.inactivate();
      taskDefinition0.addCandidateUserIdExpression(expression0);
      List<String> list0 = userTaskActivityBehavior0.extractCandidates(taskEntity0.DELETE_REASON_DELETED);
      TaskDefinition taskDefinition1 = userTaskActivityBehavior0.getTaskDefinition();
      List<ExecutionImpl> list1 = null;
      executionImpl0.setExecutions(list1);
      TaskDefinition taskDefinition2 = userTaskActivityBehavior0.getTaskDefinition();
      taskDefinition0.addCandidateGroupIdExpression(expression0);
      TaskDefinition taskDefinition3 = userTaskActivityBehavior0.getTaskDefinition();
      taskEntity0.setExecutionId(string0);
      // Undeclared exception!
      try { 
        userTaskActivityBehavior0.handleAssignments(taskEntity0, executionImpl0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      DefaultTaskFormHandler defaultTaskFormHandler0 = new DefaultTaskFormHandler();
      TaskDefinition taskDefinition0 = new TaskDefinition(defaultTaskFormHandler0);
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior(taskDefinition0);
      IdentityLinkEntity identityLinkEntity0 = new IdentityLinkEntity();
      TaskEntity taskEntity0 = identityLinkEntity0.getTask();
      String string0 = "w7oh&gEHUa1";
      ProcessDefinitionImpl processDefinitionImpl0 = null;
      ActivityImpl activityImpl0 = new ActivityImpl(string0, processDefinitionImpl0);
      ExecutionImpl executionImpl0 = new ExecutionImpl(activityImpl0);
      ExecutionImpl executionImpl1 = executionImpl0.createExecution();
      ExecutionImpl executionImpl2 = executionImpl1.findExecution(string0);
      userTaskActivityBehavior0.handleAssignments(taskEntity0, executionImpl2);
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      TaskDefinition taskDefinition0 = null;
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior(taskDefinition0);
      TaskDefinition taskDefinition1 = userTaskActivityBehavior0.getTaskDefinition();
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior();
      TaskDefinition taskDefinition0 = userTaskActivityBehavior0.getTaskDefinition();
      ExecutionEntity executionEntity0 = new ExecutionEntity();
      String string0 = "DrJsK34;?F1* #(ZZlF";
      try { 
        userTaskActivityBehavior0.signal(executionEntity0, string0, taskDefinition0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.entity.ExecutionEntity", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      TaskFormHandler taskFormHandler0 = null;
      TaskDefinition taskDefinition0 = new TaskDefinition(taskFormHandler0);
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior(taskDefinition0);
      ProcessDefinitionEntity processDefinitionEntity0 = new ProcessDefinitionEntity();
      String string0 = "email";
      ActivityImpl activityImpl0 = new ActivityImpl(string0, processDefinitionEntity0);
      ActivityImpl activityImpl1 = AtomicOperationTransitionNotifyListenerTake.findNextScope(processDefinitionEntity0, activityImpl0);
      ExecutionImpl executionImpl0 = new ExecutionImpl(activityImpl1);
      ExecutionImpl executionImpl1 = executionImpl0.getReplacedBy();
      try { 
        userTaskActivityBehavior0.signal(executionImpl1, string0, string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior();
      TaskEntity taskEntity0 = new TaskEntity();
      BpmnParser bpmnParser0 = new BpmnParser();
      BpmnParse bpmnParse0 = new BpmnParse(bpmnParser0);
      ActivityImpl activityImpl0 = bpmnParse0.getCurrentActivity();
      ExecutionImpl executionImpl0 = new ExecutionImpl(activityImpl0);
      ExecutionImpl executionImpl1 = executionImpl0.getReplacedBy();
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
  public void test10()  throws Throwable  {
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior();
      TaskDefinition taskDefinition0 = userTaskActivityBehavior0.getTaskDefinition();
      ExecutionImpl executionImpl0 = new ExecutionImpl();
      TaskEntity taskEntity0 = new TaskEntity();
      // Undeclared exception!
      try { 
        userTaskActivityBehavior0.handleAssignments(taskEntity0, executionImpl0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior();
      String string0 = "";
      List<String> list0 = userTaskActivityBehavior0.extractCandidates(string0);
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior();
      TaskDefinition taskDefinition0 = userTaskActivityBehavior0.getTaskDefinition();
      TaskEntity taskEntity0 = null;
      DeploymentManager deploymentManager0 = new DeploymentManager();
      String string0 = "";
      ExecutionImpl executionImpl0 = new ExecutionImpl();
      String string1 = "";
      try { 
        userTaskActivityBehavior0.signal(executionImpl0, string1, string1);
      } catch(ClassCastException e) {
         //
         // org.activiti.engine.impl.pvm.runtime.ExecutionImpl cannot be cast to org.activiti.engine.impl.persistence.entity.ExecutionEntity
         //
         verifyException("org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior", e);
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      DefaultTaskFormHandler defaultTaskFormHandler0 = new DefaultTaskFormHandler();
      TaskDefinition taskDefinition0 = new TaskDefinition(defaultTaskFormHandler0);
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior(taskDefinition0);
      IdentityLinkEntity identityLinkEntity0 = new IdentityLinkEntity();
      TaskEntity taskEntity0 = identityLinkEntity0.getTask();
      String string0 = "w7oh&gEHUa1";
      ProcessDefinitionImpl processDefinitionImpl0 = null;
      ActivityImpl activityImpl0 = new ActivityImpl(string0, processDefinitionImpl0);
      ActivityImpl activityImpl1 = AtomicOperationTransitionNotifyListenerTake.findNextScope(activityImpl0, activityImpl0);
      ExecutionImpl executionImpl0 = new ExecutionImpl(activityImpl1);
      ExecutionImpl executionImpl1 = executionImpl0.createExecution();
      ExecutionImpl executionImpl2 = executionImpl1.findExecution(string0);
      userTaskActivityBehavior0.handleAssignments(taskEntity0, executionImpl2);
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior();
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
  public void test16()  throws Throwable  {
      DefaultTaskFormHandler defaultTaskFormHandler0 = new DefaultTaskFormHandler();
      TaskDefinition taskDefinition0 = new TaskDefinition(defaultTaskFormHandler0);
      UserTaskActivityBehavior userTaskActivityBehavior0 = new UserTaskActivityBehavior(taskDefinition0);
      IdentityLinkEntity identityLinkEntity0 = new IdentityLinkEntity();
      TaskEntity taskEntity0 = identityLinkEntity0.getTask();
      String string0 = "w7oh&gEHUa1";
      DefaultActivityBehaviorFactory defaultActivityBehaviorFactory0 = new DefaultActivityBehaviorFactory();
      ServiceTask serviceTask0 = new ServiceTask();
      ShellActivityBehavior shellActivityBehavior0 = defaultActivityBehaviorFactory0.createShellActivityBehavior(serviceTask0);
      Expression expression0 = shellActivityBehavior0.cleanEnv;
      taskDefinition0.addCandidateUserIdExpression(expression0);
      ProcessDefinitionImpl processDefinitionImpl0 = null;
      ActivityImpl activityImpl0 = new ActivityImpl(string0, processDefinitionImpl0);
      ActivityImpl activityImpl1 = AtomicOperationTransitionNotifyListenerTake.findNextScope(activityImpl0, activityImpl0);
      ExecutionImpl executionImpl0 = new ExecutionImpl(activityImpl1);
      ExecutionImpl executionImpl1 = executionImpl0.createExecution();
      ExecutionImpl executionImpl2 = executionImpl1.findExecution(string0);
      // Undeclared exception!
      try { 
        userTaskActivityBehavior0.handleAssignments(taskEntity0, executionImpl2);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior", e);
      }
  }
}
