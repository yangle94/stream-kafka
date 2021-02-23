package com.example.demo;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author Angle
 * @version 1.0
 * @date 2021/2/23 10:15 下午
 */
public interface Test {

	String OUTPUT = "output1";

	@Output(OUTPUT)
	MessageChannel output();

	String INPUT = "input1";

	@Input(INPUT)
	SubscribableChannel input();
}
