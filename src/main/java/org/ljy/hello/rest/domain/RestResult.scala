package org.ljy.hello.rest.domain

import scala.beans.BeanProperty


class RestResult {

    @BeanProperty
    var code: Int = _

    @BeanProperty
    var msg: String = _

    @BeanProperty
    var data: Any = _

    def this(code: Int, msg: String, data: Any) = {
        this()
        this.code = code
        this.msg = msg
        this.data = data
    }

}

object RestResult {

    def ok(code: Int): RestResult = {
        new RestResult(code, null, null)
    }

    def ok(code: Int, msg: String): RestResult = {
        new RestResult(code, msg, null)
    }

    def ok(code: Int, msg: String, data: Any): RestResult = {
        new RestResult(code, msg, data)
    }

    def failed(code: Int): RestResult = {
        new RestResult(code, null, null)
    }

    def failed(code: Int, msg: String): RestResult = {
        new RestResult(code, msg, null)
    }

}
