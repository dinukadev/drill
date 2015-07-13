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
// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from protobuf

package org.apache.drill.exec.proto.beans;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;
import com.dyuproject.protostuff.Schema;

public final class OperatorProfile implements Externalizable, Message<OperatorProfile>, Schema<OperatorProfile>
{

    public static Schema<OperatorProfile> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static OperatorProfile getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final OperatorProfile DEFAULT_INSTANCE = new OperatorProfile();

    
    private List<StreamProfile> inputProfile;
    private int operatorId;
    private int operatorType;
    private long setupNanos;
    private long processNanos;
    private long peakLocalMemoryAllocated;
    private List<MetricValue> metric;
    private long waitNanos;
    private String operatorName;

    public OperatorProfile()
    {
        
    }

    // getters and setters

    // inputProfile

    public List<StreamProfile> getInputProfileList()
    {
        return inputProfile;
    }

    public OperatorProfile setInputProfileList(List<StreamProfile> inputProfile)
    {
        this.inputProfile = inputProfile;
        return this;
    }

    // operatorId

    public int getOperatorId()
    {
        return operatorId;
    }

    public OperatorProfile setOperatorId(int operatorId)
    {
        this.operatorId = operatorId;
        return this;
    }

    // operatorType

    public int getOperatorType()
    {
        return operatorType;
    }

    public OperatorProfile setOperatorType(int operatorType)
    {
        this.operatorType = operatorType;
        return this;
    }

    // setupNanos

    public long getSetupNanos()
    {
        return setupNanos;
    }

    public OperatorProfile setSetupNanos(long setupNanos)
    {
        this.setupNanos = setupNanos;
        return this;
    }

    // processNanos

    public long getProcessNanos()
    {
        return processNanos;
    }

    public OperatorProfile setProcessNanos(long processNanos)
    {
        this.processNanos = processNanos;
        return this;
    }

    // peakLocalMemoryAllocated

    public long getPeakLocalMemoryAllocated()
    {
        return peakLocalMemoryAllocated;
    }

    public OperatorProfile setPeakLocalMemoryAllocated(long peakLocalMemoryAllocated)
    {
        this.peakLocalMemoryAllocated = peakLocalMemoryAllocated;
        return this;
    }

    // metric

    public List<MetricValue> getMetricList()
    {
        return metric;
    }

    public OperatorProfile setMetricList(List<MetricValue> metric)
    {
        this.metric = metric;
        return this;
    }

    // waitNanos

    public long getWaitNanos()
    {
        return waitNanos;
    }

    public OperatorProfile setWaitNanos(long waitNanos)
    {
        this.waitNanos = waitNanos;
        return this;
    }

    // operatorName

    public String getOperatorName()
    {
        return operatorName;
    }

    public OperatorProfile setOperatorName(String operatorName)
    {
        this.operatorName = operatorName;
        return this;
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<OperatorProfile> cachedSchema()
    {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public OperatorProfile newMessage()
    {
        return new OperatorProfile();
    }

    public Class<OperatorProfile> typeClass()
    {
        return OperatorProfile.class;
    }

    public String messageName()
    {
        return OperatorProfile.class.getSimpleName();
    }

    public String messageFullName()
    {
        return OperatorProfile.class.getName();
    }

    public boolean isInitialized(OperatorProfile message)
    {
        return true;
    }

    public void mergeFrom(Input input, OperatorProfile message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    if(message.inputProfile == null)
                        message.inputProfile = new ArrayList<StreamProfile>();
                    message.inputProfile.add(input.mergeObject(null, StreamProfile.getSchema()));
                    break;

                case 3:
                    message.operatorId = input.readInt32();
                    break;
                case 4:
                    message.operatorType = input.readInt32();
                    break;
                case 5:
                    message.setupNanos = input.readInt64();
                    break;
                case 6:
                    message.processNanos = input.readInt64();
                    break;
                case 7:
                    message.peakLocalMemoryAllocated = input.readInt64();
                    break;
                case 8:
                    if(message.metric == null)
                        message.metric = new ArrayList<MetricValue>();
                    message.metric.add(input.mergeObject(null, MetricValue.getSchema()));
                    break;

                case 9:
                    message.waitNanos = input.readInt64();
                    break;
                case 10:
                    message.operatorName = input.readString();
                    break;
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, OperatorProfile message) throws IOException
    {
        if(message.inputProfile != null)
        {
            for(StreamProfile inputProfile : message.inputProfile)
            {
                if(inputProfile != null)
                    output.writeObject(1, inputProfile, StreamProfile.getSchema(), true);
            }
        }


        if(message.operatorId != 0)
            output.writeInt32(3, message.operatorId, false);

        if(message.operatorType != 0)
            output.writeInt32(4, message.operatorType, false);

        if(message.setupNanos != 0)
            output.writeInt64(5, message.setupNanos, false);

        if(message.processNanos != 0)
            output.writeInt64(6, message.processNanos, false);

        if(message.peakLocalMemoryAllocated != 0)
            output.writeInt64(7, message.peakLocalMemoryAllocated, false);

        if(message.metric != null)
        {
            for(MetricValue metric : message.metric)
            {
                if(metric != null)
                    output.writeObject(8, metric, MetricValue.getSchema(), true);
            }
        }


        if(message.waitNanos != 0)
            output.writeInt64(9, message.waitNanos, false);

        if(message.operatorName != null)
            output.writeString(10, message.operatorName, false);
    }

    public String getFieldName(int number)
    {
        switch(number)
        {
            case 1: return "inputProfile";
            case 3: return "operatorId";
            case 4: return "operatorType";
            case 5: return "setupNanos";
            case 6: return "processNanos";
            case 7: return "peakLocalMemoryAllocated";
            case 8: return "metric";
            case 9: return "waitNanos";
            case 10: return "operatorName";
            default: return null;
        }
    }

    public int getFieldNumber(String name)
    {
        final Integer number = __fieldMap.get(name);
        return number == null ? 0 : number.intValue();
    }

    private static final java.util.HashMap<String,Integer> __fieldMap = new java.util.HashMap<String,Integer>();
    static
    {
        __fieldMap.put("inputProfile", 1);
        __fieldMap.put("operatorId", 3);
        __fieldMap.put("operatorType", 4);
        __fieldMap.put("setupNanos", 5);
        __fieldMap.put("processNanos", 6);
        __fieldMap.put("peakLocalMemoryAllocated", 7);
        __fieldMap.put("metric", 8);
        __fieldMap.put("waitNanos", 9);
        __fieldMap.put("operatorName", 10);
    }
    
}
