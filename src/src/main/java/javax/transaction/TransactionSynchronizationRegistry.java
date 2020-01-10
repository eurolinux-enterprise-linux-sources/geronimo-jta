/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package javax.transaction;

/**
 * @version $Rev: 467742 $ $Date: 2006-10-25 20:30:38 +0100 (Wed, 25 Oct 2006) $
 */
public interface TransactionSynchronizationRegistry {

    Object getResource(Object key);

    boolean getRollbackOnly();

    Object getTransactionKey();

    int getTransactionStatus();

    void putResource(Object key, Object value);

    void registerInterposedSynchronization(Synchronization sync);

    void setRollbackOnly();
}
