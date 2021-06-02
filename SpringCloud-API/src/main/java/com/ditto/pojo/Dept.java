/**
 * @Description
 * @Author
 * @Date 2021/05/28 11:19:50
 * @Version
 */
package com.ditto.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
//开启链式编写
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    //每一个微服务对应一个数据库，可以是不同类型的数据库
    private String db_source;

    public  Dept(String dname){
        this.dname = dname;
    }



}
