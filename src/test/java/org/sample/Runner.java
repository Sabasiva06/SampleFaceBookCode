package org.sample;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Sample.class, Sample2.class, Sample3.class })
public class Runner {

	public static void main(String[] args) {

		Result runClasses = JUnitCore.runClasses(Runner.class);
		int failureCount = runClasses.getFailureCount();
		System.out.println(failureCount);
		int ignoreCount = runClasses.getIgnoreCount();
		System.out.println(ignoreCount);
		int runCount = runClasses.getRunCount();
		System.out.println(runCount);
		
		List<Failure> failures = runClasses.getFailures();
		
		for (Failure failure : failures) {
			System.out.println(failure.toString());
		}
	}
}
