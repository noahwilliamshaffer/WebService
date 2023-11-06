# WebService
A serverless web service deployed on AWS using AWS API Gateway, AWS Lambda, AWS CloudFormation, AWS S3, and AWS IAM.

## Deployment
1. Build the WebService with Maven.
```bash
mvn install
mvn clean package
``` 
2. [First Time Only] Create an S3 bucket to use as a cache. Optionally, add a retention policy to ensure the cache is automatically cleared.
```bash
aws s3api create-bucket --bucket <bucket name>
```
3. Package the WebService.
```bash
aws cloudformation package --template-file ./configuration/stack.yml \
    --s3-bucket <bucket name> \
    --output-template-file ./configuration/packaged.stack.yml
```
4. Deploy the WebService
```bash
aws cloudformation deploy --template-file ./configuration/packaged.stack.yml \
  --stack-name "WebService" \
  --capabilities "CAPABILITY_NAMED_IAM"
```

## References
[ProjectLombok](https://projectlombok.org/)

[Google Guava](https://github.com/google/guava/)
