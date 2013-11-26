package com.graphaware.relcount.perf;

import com.graphaware.framework.performance.PerformanceTest;
import com.graphaware.framework.performance.PerformanceTestSuite;
import org.junit.Ignore;

/**
 * Performance test suite for relationship count module.
 */
@Ignore
public class RelationshipCountPerformanceTestSuite extends PerformanceTestSuite {

    @Override
    protected PerformanceTest[] getPerfTests() {
        return new PerformanceTest[]{
                new CreateRelationships(),
                new CountRelationships()
        };
    }
}