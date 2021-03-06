package com.lts.ec;

import com.lts.core.cluster.Config;
import com.lts.core.extension.Adaptive;
import com.lts.core.extension.SPI;

/**
 * @author Robert HG (254963746@qq.com) on 5/19/15.
 */
@SPI("injvm")
public interface EventCenterFactory {

    @Adaptive("event.center")
    EventCenter getEventCenter(Config config);

}
