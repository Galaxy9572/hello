package org.ljy.hello.user.domain.request

import scala.beans.BeanProperty

class UserRequest {

    @BeanProperty
    var nick: String = _

    @BeanProperty
    var gender: String = _

}
