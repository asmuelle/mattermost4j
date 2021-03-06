/*
 * Copyright (c) 2017 Takayuki Maruyama
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package net.bis5.mattermost.client4.api;

import net.bis5.mattermost.client4.ApiResponse;
import net.bis5.mattermost.client4.Pager;
import net.bis5.mattermost.model.Audits;

/**
 * Audits API.
 * 
 * @author Takayuki Maruyama
 */
public interface AuditsApi {

  /**
   * returns a list of audits for the whole system.
   */
  default ApiResponse<Audits> getAudits() {
    return getAudits(Pager.defaultPager());
  }

  /**
   * returns a list of audits for the whole system.
   */
  default ApiResponse<Audits> getAudits(Pager pager) {
    return getAudits(pager, null);
  }

  /**
   * returns a list of audits for the whole system.
   */
  ApiResponse<Audits> getAudits(Pager pager, String etag);

}
