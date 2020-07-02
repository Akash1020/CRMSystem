package com.springboot.crm.dao;

import com.springboot.crm.entity.Backup;
import com.springboot.crm.entity.BackupExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BackupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table backup
     *
     * @mbg.generated
     */
    long countByExample(BackupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table backup
     *
     * @mbg.generated
     */
    int deleteByExample(BackupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table backup
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table backup
     *
     * @mbg.generated
     */
    int insert(Backup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table backup
     *
     * @mbg.generated
     */
    int insertSelective(Backup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table backup
     *
     * @mbg.generated
     */
    List<Backup> selectByExample(BackupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table backup
     *
     * @mbg.generated
     */
    Backup selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table backup
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Backup record, @Param("example") BackupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table backup
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Backup record, @Param("example") BackupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table backup
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Backup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table backup
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Backup record);
}