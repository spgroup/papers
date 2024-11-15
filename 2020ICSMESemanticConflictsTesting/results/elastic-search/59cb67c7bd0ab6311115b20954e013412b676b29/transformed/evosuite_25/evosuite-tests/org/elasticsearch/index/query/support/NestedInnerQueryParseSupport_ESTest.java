/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 01:09:37 GMT 2020
 */

package org.elasticsearch.index.query.support;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonParser;
import com.google.common.collect.ImmutableMap;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Spliterator;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.LeafReader;
import org.apache.lucene.index.SlowCompositeReaderWrapper;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.NGramPhraseQuery;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.Weight;
import org.apache.lucene.search.join.BitDocIdSetCachingWrapperFilter;
import org.apache.lucene.search.join.BitDocIdSetFilter;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.common.bytes.BytesReference;
import org.elasticsearch.common.bytes.PagedBytesReference;
import org.elasticsearch.common.io.stream.ByteBufferStreamInput;
import org.elasticsearch.common.util.BigArrays;
import org.elasticsearch.common.util.ByteArray;
import org.elasticsearch.common.xcontent.ToXContent;
import org.elasticsearch.common.xcontent.XContentParser;
import org.elasticsearch.common.xcontent.json.JsonXContent;
import org.elasticsearch.common.xcontent.json.JsonXContentParser;
import org.elasticsearch.index.mapper.Mapper;
import org.elasticsearch.index.mapper.MergeResult;
import org.elasticsearch.index.mapper.SourceToParse;
import org.elasticsearch.index.mapper.object.ObjectMapper;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryParseContext;
import org.elasticsearch.index.query.QueryShardContext;
import org.elasticsearch.index.query.support.NestedInnerQueryParseSupport;
import org.elasticsearch.search.internal.SearchContext;
import org.elasticsearch.search.internal.ShardSearchTransportRequest;
import org.elasticsearch.search.internal.SubSearchContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NestedInnerQueryParseSupport_ESTest extends NestedInnerQueryParseSupport_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.getInnerFilter();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.QueryShardException", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.getInnerQuery();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.QueryShardException", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      QueryShardContext queryShardContext0 = null;
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = null;
      try {
        nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport(queryShardContext0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean0 = nestedInnerQueryParseSupport0.filterFound();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.getInnerQuery();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.QueryShardException", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      ObjectMapper objectMapper0 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
      ObjectMapper objectMapper1 = nestedInnerQueryParseSupport0.getParentObjectMapper();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.query();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      String string0 = null;
      ObjectMapper objectMapper0 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
      String string1 = nestedInnerQueryParseSupport0.getPath();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.filter();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      nestedInnerQueryParseSupport0.filterFound = nestedInnerQueryParseSupport0.queryParsed;
      Query query0 = nestedInnerQueryParseSupport0.innerFilter;
      nestedInnerQueryParseSupport0.innerQuery = query0;
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.resetPathLevel();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean0 = true;
      nestedInnerQueryParseSupport0.filterFound = boolean0;
      Query query0 = nestedInnerQueryParseSupport0.innerFilter;
      nestedInnerQueryParseSupport0.filterParsed = boolean0;
      String string0 = nestedInnerQueryParseSupport0.getPath();
      boolean boolean1 = nestedInnerQueryParseSupport0.queryFound();
      ObjectMapper objectMapper0 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
      Query query1 = nestedInnerQueryParseSupport0.getInnerFilter();
      String string1 = null;
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.setPath(string1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      String string0 = "rpNAD";
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.query();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      JsonXContent jsonXContent0 = JsonXContent.jsonXContent;
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)35;
      byteArray0[0] = byte0;
      byte byte1 = (byte) (-92);
      byteArray0[1] = byte1;
      byte byte2 = (byte)0;
      byteArray0[2] = byte2;
      byteArray0[3] = byte1;
      byte byte3 = (byte) (-108);
      byte byte4 = (byte) (-105);
      byteArray0[5] = byte4;
      byte byte5 = (byte) (-8);
      byteArray0[6] = byte5;
      XContentParser xContentParser0 = jsonXContent0.createParser(byteArray0);
      SearchContext searchContext0 = null;
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = null;
      try {
        nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport(xContentParser0, searchContext0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.filter();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean0 = true;
      nestedInnerQueryParseSupport0.queryParsed = boolean0;
      Query query0 = nestedInnerQueryParseSupport0.getInnerQuery();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.setPathLevel();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      BitDocIdSetCachingWrapperFilter bitDocIdSetCachingWrapperFilter0 = new BitDocIdSetCachingWrapperFilter(nestedInnerQueryParseSupport0.childFilter);
      nestedInnerQueryParseSupport0.childFilter = (BitDocIdSetFilter) bitDocIdSetCachingWrapperFilter0;
      String string0 = nestedInnerQueryParseSupport0.getPath();
      boolean boolean0 = nestedInnerQueryParseSupport0.filterFound();
      ObjectMapper objectMapper0 = nestedInnerQueryParseSupport0.getParentObjectMapper();
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      BitDocIdSetFilter bitDocIdSetFilter0 = nestedInnerQueryParseSupport0.parentFilter;
      nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter0;
      boolean boolean0 = false;
      nestedInnerQueryParseSupport0.queryParsed = boolean0;
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.getInnerFilter();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.QueryShardException", e);
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean0 = nestedInnerQueryParseSupport0.filterFound();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.query();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      Query query0 = null;
      nestedInnerQueryParseSupport0.innerFilter = query0;
      ObjectMapper objectMapper0 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
      boolean boolean0 = nestedInnerQueryParseSupport0.queryFound();
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.resetPathLevel();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      QueryShardContext queryShardContext0 = null;
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = null;
      try {
        nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport(queryShardContext0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      ObjectMapper objectMapper0 = nestedInnerQueryParseSupport0.getParentObjectMapper();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.resetPathLevel();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean0 = true;
      nestedInnerQueryParseSupport0.filterFound = boolean0;
      BytesReference bytesReference0 = null;
      nestedInnerQueryParseSupport0.source = bytesReference0;
      boolean boolean1 = nestedInnerQueryParseSupport0.filterFound();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.query();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test20()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      int int0 = (-5316);
      NGramPhraseQuery nGramPhraseQuery0 = new NGramPhraseQuery(int0);
      nestedInnerQueryParseSupport0.innerFilter = (Query) nGramPhraseQuery0;
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.filter();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test21()  throws Throwable  {
      String string0 = "org.elasticsearch.index.query.support.NestedInnerQueryParseSupport";
      SearchContext searchContext0 = SearchContext.current();
      XContentParser xContentParser0 = null;
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = null;
      try {
        nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport(xContentParser0, searchContext0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test22()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.getInnerQuery();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.QueryShardException", e);
      }
  }

  @Test(timeout = 11000)
  public void test23()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.filter();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test24()  throws Throwable  {
      JsonParser jsonParser0 = null;
      JsonXContentParser jsonXContentParser0 = new JsonXContentParser(jsonParser0);
      SearchContext searchContext0 = null;
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = null;
      try {
        nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport(jsonXContentParser0, searchContext0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test25()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      String string0 = "<(P>p!2=Si9jbIE";
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.setPath(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test26()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      QueryParseContext queryParseContext0 = nestedInnerQueryParseSupport0.parseContext;
      nestedInnerQueryParseSupport0.parseContext = queryParseContext0;
      boolean boolean0 = true;
      String string0 = "_:DK0";
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.setPath(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test27()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.setPathLevel();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test28()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean0 = true;
      nestedInnerQueryParseSupport0.queryFound = boolean0;
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.getInnerFilter();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.QueryShardException", e);
      }
  }

  @Test(timeout = 11000)
  public void test29()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean0 = true;
      nestedInnerQueryParseSupport0.queryParsed = boolean0;
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.getInnerFilter();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.QueryShardException", e);
      }
  }

  @Test(timeout = 11000)
  public void test30()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean0 = true;
      nestedInnerQueryParseSupport0.queryFound = boolean0;
      BitDocIdSetFilter bitDocIdSetFilter0 = nestedInnerQueryParseSupport0.parentFilter;
      nestedInnerQueryParseSupport0.filterFound = boolean0;
      nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter0;
      boolean boolean1 = false;
      nestedInnerQueryParseSupport0.filterParsed = boolean1;
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.getInnerFilter();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.QueryShardException", e);
      }
  }

  @Test(timeout = 11000)
  public void test31()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean0 = true;
      nestedInnerQueryParseSupport0.filterFound = boolean0;
      BytesReference bytesReference0 = null;
      nestedInnerQueryParseSupport0.source = bytesReference0;
      boolean boolean1 = nestedInnerQueryParseSupport0.queryFound();
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.query();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test32()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean0 = true;
      nestedInnerQueryParseSupport0.filterParsed = boolean0;
      Query query0 = nestedInnerQueryParseSupport0.getInnerFilter();
      ObjectMapper objectMapper0 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
  }

  @Test(timeout = 11000)
  public void test33()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean0 = true;
      nestedInnerQueryParseSupport0.queryParsed = boolean0;
      boolean boolean1 = nestedInnerQueryParseSupport0.queryFound();
      boolean boolean2 = nestedInnerQueryParseSupport0.queryFound();
  }

  @Test(timeout = 11000)
  public void test34()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport();
      boolean boolean0 = true;
      nestedInnerQueryParseSupport0.filterFound = boolean0;
      Query query0 = nestedInnerQueryParseSupport0.innerFilter;
      nestedInnerQueryParseSupport0.filterParsed = boolean0;
      nestedInnerQueryParseSupport0.innerQuery = query0;
      String string0 = nestedInnerQueryParseSupport0.getPath();
      ObjectMapper objectMapper0 = nestedInnerQueryParseSupport0.getParentObjectMapper();
      boolean boolean1 = nestedInnerQueryParseSupport0.queryFound();
      ObjectMapper objectMapper1 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
      Query query1 = nestedInnerQueryParseSupport0.getInnerFilter();
      String string1 = null;
      // Undeclared exception!
      try { 
        nestedInnerQueryParseSupport0.setPath(string1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }
}
