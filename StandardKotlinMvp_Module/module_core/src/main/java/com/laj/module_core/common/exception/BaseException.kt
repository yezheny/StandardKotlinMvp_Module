package com.laj.module_core.common.exception

/**
 * Desc:
 * Author: hy
 * Date: 2019/7/3 14:10
 **/

class BaseException(
        var error_code: String = "",
        var error_msg: String = "",
        var error_enum: ErrorEnums? = null
) : Exception()