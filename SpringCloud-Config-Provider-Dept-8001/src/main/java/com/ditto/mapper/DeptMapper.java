/**
 * @Author Ditto
 * @Date 2021/05/28 14:08:27
 * @Version 1.0
 */
package com.ditto.mapper;

import com.ditto.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptMapper {

    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();
}
