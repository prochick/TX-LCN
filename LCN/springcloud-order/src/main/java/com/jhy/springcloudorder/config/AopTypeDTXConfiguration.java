//package com.jhy.springcloudorder.config;
//
//import com.codingapi.txlcn.common.util.Transactions;
//import com.codingapi.txlcn.tc.aspect.interceptor.TxLcnInterceptor;
//import com.codingapi.txlcn.tc.aspect.weave.DTXLogicWeaver;
//import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.transaction.interceptor.TransactionInterceptor;
//
//import java.util.Properties;
//
///**
// * @author: jihongye
// * @date: 2021/03/10/23:34
// * @description:
// */
//@Configuration
//@EnableTransactionManagement
//public class AopTypeDTXConfiguration {
//    /**
//     * 本地事务配置
//     *
//     * @param transactionManager
//     * @return
//     */
//    @Bean
//    @ConditionalOnMissingBean
//    public TransactionInterceptor transactionInterceptor(PlatformTransactionManager transactionManager) {
//        Properties properties = new Properties();
//        properties.setProperty("*", "PROPAGATION_REQUIRED,-Throwable");
//        TransactionInterceptor transactionInterceptor = new TransactionInterceptor();
//        transactionInterceptor.setTransactionManager(transactionManager);
//        transactionInterceptor.setTransactionAttributes(properties);
//        return transactionInterceptor;
//    }
//
//    /**
//     * 分布式事务配置 设置为LCN模式
//     *
//     * @param dtxLogicWeaver
//     * @return
//     */
//    @ConditionalOnBean(DTXLogicWeaver.class)
//    @Bean
//    public TxLcnInterceptor txLcnInterceptor(DTXLogicWeaver dtxLogicWeaver) {
//        TxLcnInterceptor txLcnInterceptor = new TxLcnInterceptor(dtxLogicWeaver);
//        Properties properties = new Properties();
//        properties.setProperty(Transactions.DTX_TYPE, Transactions.LCN);
//        properties.setProperty(Transactions.DTX_PROPAGATION, "REQUIRED");
//        txLcnInterceptor.setTransactionAttributes(properties);
//        return txLcnInterceptor;
//    }
//
//    @Bean
//    public BeanNameAutoProxyCreator beanNameAutoProxyCreator() {
//        BeanNameAutoProxyCreator beanNameAutoProxyCreator = new BeanNameAutoProxyCreator();
//        beanNameAutoProxyCreator.setInterceptorNames("txLcnInterceptor", "transactionInterceptor");
//        beanNameAutoProxyCreator.setBeanNames("*Impl");
//        return beanNameAutoProxyCreator;
//    }
//}
