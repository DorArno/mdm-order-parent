/**************************************************************************/
/*                                                                        */
/* Copyright (c) 2017 CCPG Company                                       */
/* 长城物业集团股份有限公司版权所有                                           */
/*                                                                        */
/* PROPRIETARY RIGHTS of CCPG Company are involved in the                */
/* subject matter of this material. All manufacturing, reproduction, use, */
/* and sales rights pertaining to this subject matter are governed by the */
/* license agreement. The recipient of this software implicitly accepts   */
/* the terms of the license.                                              */
/* 本软件文档资料是长城物业集团股份有限公司的资产，任何人士阅读和                   */
/* 使用本资料必须获得相应的书面授权，承担保密责任和接受相应的法律约束。                 */
/*                                                                        */
/**************************************************************************/

/**
  * <pre>
  * 作   者：Allison
  * 创建日期：2017-5-3
  * </pre>
  */

package com.einwin.mdm.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.einwin.framework.annotation.PropertyFiltration;
import com.einwin.framework.model.Pagination;
import com.einwin.framework.model.ResponseData;
import com.einwin.mdm.order.model.Grouponorder;
import com.einwin.mdm.order.service.GrouponorderService;

/**
 * <pre>
 * 表现层控制类
 * </pre>
 */
//@RefreshScope
//@RestController
//@RequestMapping(value = "/order/grouponorder")
public class GrouponorderController {
    private static final Logger logger = LoggerFactory.getLogger(GrouponorderController.class);
    
    @Autowired
    private GrouponorderService grouponorderService;

    //@PropertyFiltration(clazz = Grouponorder.class, excludes = {"updationDate", "enabledFlag"}, includes = {"createdBy"})
    @RequestMapping("/{id}")
    public Grouponorder get(@PathVariable("id") String id) {
        Grouponorder grouponorder = null;
        grouponorder = grouponorderService.get(id);

        return grouponorder;
    }
}