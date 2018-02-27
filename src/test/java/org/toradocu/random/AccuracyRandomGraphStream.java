package org.toradocu.random;

import org.junit.Test;
import org.toradocu.testlib.AbstractPrecisionRecallTestSuite;
import org.toradocu.testlib.PrecisionRecallTest;

public class AccuracyRandomGraphStream extends AbstractPrecisionRecallTestSuite {

  private static final String SRC = "src/test/resources/gs-core-1.3-sources";
  private static final String EXPECTED = "src/test/resources/GraphStream-1.3/";

  @Test
  public void graphMetricsTest() throws Exception {
    test("org.graphstream.ui.swingViewer.util.GraphMetrics");
  }

  @Test
  public void fixedArrayListTest() throws Exception {
    test("org.graphstream.util.set.FixedArrayList");
  }

  @Test
  public void graphicElementTest() throws Exception {
    test("org.graphstream.ui.graphicGraph.GraphicElement");
  }

  @Test
  public void environmentTest() throws Exception {
    test("org.graphstream.util.Environment");
  }

  @Test
  public void pathTest() throws Exception {
    test("org.graphstream.graph.Path");
  }

  @Test
  public void testSingleGraph() throws Exception {
    test("org.graphstream.graph.implementations.SingleGraph");
  }

  @Test
  public void testMultiGraph() throws Exception {
    test("org.graphstream.graph.implementations.MultiGraph");
  }

  private void test(String clazz) {
    testSuiteStats.addTest(PrecisionRecallTest.test(clazz, SRC, EXPECTED));
  }
}