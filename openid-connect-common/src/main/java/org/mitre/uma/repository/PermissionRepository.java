/*******************************************************************************
 * Copyright 2015 The MITRE Corporation
 *   and the MIT Kerberos and Internet Trust Consortium
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package org.mitre.uma.repository;

import org.mitre.uma.model.Permission;

/**
 * @author jricher
 *
 */
public interface PermissionRepository {

	/**
	 * @param p
	 * @return
	 */
	public Permission save(Permission p);

	/**
	 * Get the permission indicated by its ticket value.
	 * 
	 * @param ticket
	 * @return
	 */
	public Permission getByTicket(String ticket);

}
