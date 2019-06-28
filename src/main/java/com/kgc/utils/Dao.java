package com.kgc.utils;

import java.util.List;

public interface Dao<T> {
    /**
     * 功能 -完成增加
     * @param t 将要增加的数据封装到t这个对象中
     * @return
     */
    public int insert(T t);

    /**
     * 完成修改
     * @param t
     * @return
     */
    public int update(T t);

    /**
     * 根据id来删除
     * @param id
     * @return
     */
     public int delete(int id);

    /**
     * 根据id来查询
     * @param id
     * @return  将返回的记录实例化成对象
     */
    public T findById(int id);

    /**查询表中的所有记录，将每一条记录实例化成对象，再每个对象放到List中返回
     *
     * @return
     */
    public List<T> findAll();
}
