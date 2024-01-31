/**
 * Created by IntelliJ IDEA.
 * User: 加棉
 * Date: 2023/12/28
 * Time: 19:57
 */
package com.jiamian.huobanpipeibackend.model.request;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserTeamAddRequest implements Serializable {

    private static final long serialVersionUID = -380233498095407123L;

    private String teamId;

    private String password;
}
