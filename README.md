# Spring Kube Learning

- first test single service with docker   spring-cloud-learning-single-service-with-docker
- multi service with docker spring-cloud-learning-single-service-with-docker
- multi service with docker + gateway + eureka spring-gateway-docker
- spring-single-kube-service-under-minikube  development under minikube
- spring-single-service-deploy-kube  deploy in kube.  Don't forget eval $(minikube docker-env) before docker build. Test service IP Get: minikube service single-service --url
- spring-multi-service-deploy-kube-fein multi service with fein/ribbon and circle breaker deployed in kube. For ribbon usage, don't forget run "kubectl create clusterrolebinding admin --clusterrole=cluster-admin --serviceaccount=default:default" if error "Failed to instantiate [com.netflix.loadbalancer.ILoadBalancer]: Factory method 'ribbonLoadBalancer' threw exception; nested exception is io.fabric8.kubernetes.client.KubernetesClientException: Operation: [get]  for kind: [Endpoints]  with name: [hello-service]  in namespace: [default]  failed." happen


