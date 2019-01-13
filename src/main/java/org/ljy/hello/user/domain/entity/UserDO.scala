package org.ljy.hello.user.domain.entity

import java.time.LocalDateTime

import javax.persistence._
import org.ljy.hello.user.enums.GenderEnum

import scala.beans.BeanProperty

@Entity
@Table(name = "user")
class UserDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @BeanProperty
    var uid: Int = _

    @BeanProperty
    var nick: String = _

    @Enumerated(EnumType.STRING)
    @BeanProperty
    var gender: GenderEnum = _

    @BeanProperty
    var createDate: LocalDateTime = _

}
