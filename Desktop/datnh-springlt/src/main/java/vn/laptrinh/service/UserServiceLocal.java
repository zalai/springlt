// ----------------------------------------------------------------------------
// Copyright 2014, LAPTRINH.VN.
// All rights reserved
// ----------------------------------------------------------------------------
// Change History:
//  2014.08.17  datnh
//     - Initial release
// ----------------------------------------------------------------------------
package vn.laptrinh.service;

import java.util.List;

import vn.laptrinh.domain.User;

/**
 * <p>
 * Title: SpringLT
 * </p>
 * <p>
 * Copyright: Copyright (c) by laptrinh.vn 2014
 * </p>
 * 
 * @author laptrinh.vn
 * @version 0.1
 */
public interface UserServiceLocal {

	User getByUserId(long id);
	
	List<User> getUserList();

	void insert(User user);

	void updateByPrimaryKey(User user);
}
