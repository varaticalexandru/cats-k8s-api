. .\load_env_vars.ps1; if ($?) { .\gradlew clean build } else { Write-Host "Environment variable loading failed"; exit }
if ($?) { docker build . -t alexandruvaratic/cats-api:1.0.0 } else { Write-Host "Gradle build failed"; exit }
if ($?) { docker push alexandruvaratic/cats-api:1.0.0 } else { Write-Host "Docker build failed"; exit }
