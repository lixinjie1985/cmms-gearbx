package com.cmos.ha.cmms.gearbx.tempmsg.dubbo.consumer;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cmos.ha.cmms.common.tempmsg.SlideResult;
import com.cmos.ha.cmms.common.tempmsg.TempMsg;
import com.cmos.ha.cmms.common.tempmsg.dubbo.ITempMsgSlider;

/**
 * @author lixinjie
 * @since 2017-12-17
 */
@Service
public class TempMsgSlider {

	@Reference
	private ITempMsgSlider tempMsgSlider;
	
	public SlideResult slideTempMsg(TempMsg tempMsg) {
		return tempMsgSlider.slideTempMsg(tempMsg);
	}
}
