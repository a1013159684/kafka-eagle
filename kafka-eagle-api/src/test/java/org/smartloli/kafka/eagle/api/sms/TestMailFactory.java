/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.smartloli.kafka.eagle.api.sms;

import org.smartloli.kafka.eagle.api.email.MailFactory;
import org.smartloli.kafka.eagle.api.email.MailProvider;

/**
 * Test mail interface.
 * 
 * @author smartloli.
 *
 *         Created by Oct 31, 2017
 */
public class TestMailFactory {

	public static void main(String[] args) {
		MailProvider provider = new MailFactory();
		String subject = "Kafka Eagle Consumer Alert";
		String address = "smartloli.org@gmail.com";
		String content = "Group Name is [Test],Topic is [ke_test2],current lag is [15000],expired lag is [10000].";
		provider.create().send(subject, address, content, "");
	}

}
