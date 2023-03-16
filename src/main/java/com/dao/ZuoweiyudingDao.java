package com.dao;

import com.entity.ZuoweiyudingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuoweiyudingVO;
import com.entity.view.ZuoweiyudingView;


/**
 * 座位预订
 * 
 * @author 
 * @email 
 * @date 2021-03-11 13:48:15
 */
public interface ZuoweiyudingDao extends BaseMapper<ZuoweiyudingEntity> {
	
	List<ZuoweiyudingVO> selectListVO(@Param("ew") Wrapper<ZuoweiyudingEntity> wrapper);
	
	ZuoweiyudingVO selectVO(@Param("ew") Wrapper<ZuoweiyudingEntity> wrapper);
	
	List<ZuoweiyudingView> selectListView(@Param("ew") Wrapper<ZuoweiyudingEntity> wrapper);

	List<ZuoweiyudingView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoweiyudingEntity> wrapper);
	
	ZuoweiyudingView selectView(@Param("ew") Wrapper<ZuoweiyudingEntity> wrapper);
	
}
