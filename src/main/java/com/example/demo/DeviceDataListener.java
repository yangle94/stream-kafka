package com.example.demo;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * @author Angle
 * @version 1.0
 * @date 2021/2/23 10:16 下午
 */
@Component
public class DeviceDataListener {

	@StreamListener(target = Processor.INPUT
//    , concurrency = "100-150"
	)
	public void handleMessage(@Payload String message
//            ,

//                              @Header(value = AmqpHeaders.REDELIVERED, required = false) boolean reDelivered,
//                              @Header(value = "forwardMsg", required = false, defaultValue = "false") boolean forwardMsg,
//                              @Header(value = AmqpHeaders.CORRELATION_ID, required = false) String correlationId
	) throws Exception {

		System.out.println(1111);
	}

	@StreamListener(target = Test.INPUT)
	public void handleMessage1(@Payload String message) throws Exception {

		System.out.println(222);
	}
}
