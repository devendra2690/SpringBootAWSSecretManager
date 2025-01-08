AWS Secrets Manager is a highly secure service for managing secrets such as database credentials, API keys, and other sensitive information.										
																			
																			
Key Features of AWS Secrets Manager:																			
																			
1. Automatic Rotation:																			
Secrets Manager enables automatic rotation of secrets (e.g., passwords) with pre-configured integrations for services like Amazon RDS.																			
You can use custom Lambda functions to handle secret rotation for custom applications.																			
																			
2. Native AWS Service Integration:																			
Direct integration with services like Amazon RDS, Aurora, and Redshift.																			
Secrets Manager simplifies managing credentials for these services by automating secret rotation and access.																			
																			
3. Multi-Region Replication:																			
Secrets Manager allows secrets to be replicated across regions for high availability and disaster recovery.																			
																			
4. Encryption:																			
Secrets are encrypted using AWS KMS, providing fine-grained control over who can access the secrets.																			
																			
5. Auditability:																			
Integration with CloudTrail allows you to audit access to your secrets.																			
																			
6. Cost:																			
Secrets Manager is a paid service, costing approximately $0.40 per secret per month and an additional fee for automated secret rotation.																			

To run this application please setup AWS account and Keys in secret manager:


![image](https://github.com/user-attachments/assets/bbb76506-db8c-4a72-b3d6-3017f120a7e7)
