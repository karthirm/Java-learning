package com.learning.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithAtomicInteger {

	private AtomicInteger atomicI = new AtomicInteger();
	private AtomicInteger atomicJ = new AtomicInteger();
	
	public void incrementI() {
		atomicI.incrementAndGet();
		
	}
	public int getI() {
		return atomicI.get();
	}
	
	public void incrementJ() {
		atomicJ.incrementAndGet();	
	}
	public int getJ() {
		return atomicJ.get();
	}
	
}
