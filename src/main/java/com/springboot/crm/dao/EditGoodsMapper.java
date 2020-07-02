package com.springboot.crm.dao;

import com.springboot.crm.entity.EditGoods;
import com.springboot.crm.entity.EditGoodsExample;
import com.springboot.crm.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface EditGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edit_goods
     *
     * @mbg.generated
     */
    long countByExample(EditGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edit_goods
     *
     * @mbg.generated
     */
    int deleteByExample(EditGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edit_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edit_goods
     *
     * @mbg.generated
     */
    int insert(EditGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edit_goods
     *
     * @mbg.generated
     */
    int insertSelective(EditGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edit_goods
     *
     * @mbg.generated
     */
    List<EditGoods> selectByExample(EditGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edit_goods
     *
     * @mbg.generated
     */
    EditGoods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edit_goods
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EditGoods record, @Param("example") EditGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edit_goods
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EditGoods record, @Param("example") EditGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edit_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EditGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edit_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EditGoods record);
}