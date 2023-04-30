package com.gazaltech.config;

//@Configuration
//@EnableMongoRepositories(basePackages = "com.gazaltech.core.infra.repositorys")
//public class MongoConfig extends AbstractMongoClientConfiguration {
//	@Value("${spring.data.mongodb.uri}")
//    private String uri;
//
//    @Value("${spring.data.mongodb.database}")
//    private String database;
//    
//    @Bean
//    public MongoClient mongoClient() {
//        return MongoClients.create(uri);
//    }
//
//    @Bean
//    public MongoTemplate mongoTemplate() {
//        return new MongoTemplate(mongoClient(), getDatabaseName());
//    }
//
//	@Override
//	protected String getDatabaseName() {
//		// TODO Auto-generated method stub
//		return database;
//	}
//}
