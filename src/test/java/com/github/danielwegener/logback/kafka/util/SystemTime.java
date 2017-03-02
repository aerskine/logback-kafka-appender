package com.github.danielwegener.logback.kafka.util;

import org.apache.kafka.common.utils.Time;

class SystemTime implements Time {
    public long milliseconds() {
        return System.currentTimeMillis();
    }

    public long nanoseconds() {
        return System.nanoTime();
    }

    public void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            // Ignore
        }
    }

    @Override
    public long hiResClockMs() {
        return 0;
    }
}