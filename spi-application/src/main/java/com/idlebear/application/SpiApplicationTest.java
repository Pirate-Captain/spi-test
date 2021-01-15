/*
 * iaskbear
 * Created on 2021-01-15
 */
package com.idlebear.application;

import com.idlebear.service.SpiShow;

import java.util.ServiceLoader;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public class SpiApplicationTest {
    public static void main(String[] args) {
        ServiceLoader<SpiShow> loader = ServiceLoader.load(SpiShow.class);
        for ( SpiShow spiShow : loader ) {
            spiShow.show();
        }
    }
}