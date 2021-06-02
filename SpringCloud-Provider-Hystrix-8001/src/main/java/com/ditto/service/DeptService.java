/**
 * @Description
 * @Author
 * @Date 2021/05/28 14:19:22
 * @Version
 */
package com.ditto.service;

import com.ditto.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;



public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();
}
