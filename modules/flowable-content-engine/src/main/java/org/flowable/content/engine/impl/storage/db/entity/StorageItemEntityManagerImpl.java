/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.flowable.content.engine.impl.storage.db.entity;

import org.flowable.common.engine.impl.persistence.entity.data.DataManager;
import org.flowable.content.engine.ContentEngineConfiguration;
import org.flowable.content.engine.impl.persistence.entity.AbstractEntityManager;
import org.flowable.content.engine.impl.storage.db.StorageItemDataManager;

/**
 * @author Jorge Moraleda
 */
public class StorageItemEntityManagerImpl extends AbstractEntityManager<StorageItemEntity> implements StorageItemEntityManager {

    protected StorageItemDataManager storageDataManager;

    public StorageItemEntityManagerImpl(ContentEngineConfiguration contentEngineConfiguration, StorageItemDataManager storageDataManager) {
        super(contentEngineConfiguration);
        this.storageDataManager = storageDataManager;
    }

    @Override
    protected DataManager<StorageItemEntity> getDataManager() {
        return storageDataManager;
    }

    public StorageItemDataManager getstorageDataManager() {
        return storageDataManager;
    }

    public void setstorageDataManager(StorageItemDataManager storageDataManager) {
        this.storageDataManager = storageDataManager;
    }

}
