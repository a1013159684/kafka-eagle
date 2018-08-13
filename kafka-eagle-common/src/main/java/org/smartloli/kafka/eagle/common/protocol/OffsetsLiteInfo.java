/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.smartloli.kafka.eagle.common.protocol;

/**
 * Definition offset lite information.
 *
 * @author smartloli.
 * <p>
 * Created by Aug 18, 2016
 */
public class OffsetsLiteInfo extends BaseProtocol {

    private String group = "";
    private String topic = "";
    private long logSize = 0L;
    private long offsets = 0L;
    private long lag = 0L;
    private String created = "";

    public String getKey() {
        return group + ":" + topic;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public long getLogSize() {
        return logSize;
    }

    public void setLogSize(long logSize) {
        this.logSize = logSize;
    }

    public long getOffsets() {
        return offsets;
    }

    public void setOffsets(long offsets) {
        this.offsets = offsets;
    }

    public long getLag() {
        return lag;
    }

    public void setLag(long lag) {
        this.lag = lag;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "OffsetsLiteInfo{" +
                "group='" + group + '\'' +
                ", topic='" + topic + '\'' +
                ", logSize=" + logSize +
                ", offsets=" + offsets +
                ", lag=" + lag +
                ", created='" + created + '\'' +
                '}';
    }
}
