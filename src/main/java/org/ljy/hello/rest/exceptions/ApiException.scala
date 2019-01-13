package org.ljy.hello.rest.exceptions

import scala.beans.BeanProperty

class ApiException extends RuntimeException {

    @BeanProperty
    var msg: String = _

    def this(msg: String) = {
        super.(msg)
    }

}
