package com.ticket.service.ddd.infrastructure.distributed.redission.impl;

import java.util.concurrent.TimeUnit;

public interface RedisDistributedLocker {
    boolean tryLock(long waitTime, long leaseTime, TimeUnit unit) throws InterruptedException;

    void lock(long leaseTime, TimeUnit unit);

    void unlock();

    boolean isLocked();

    boolean isHeldByThread(long threadId);

    boolean isHeldByCurrentThread();
}
