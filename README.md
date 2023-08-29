<h1>Thesis project on automated site testing <a href="https://www.thebach.com/" </h1>

<img src="media/logo/Logo_png.svg" width="500">

## :bookmark_tabs: Content 
- <a href="#tools">Stack of technologies</a>
- <a href="#tests">List of checks</a>
- <a href="#run">Running tests from the terminal</a>
- <a href="#remote">Remote running tests</a>
- <a href="#jenkins-report">Running tests in Jenkins</a>
- <a href="#allure-report">Test results report in Allure Report</a>
- <a href="#allure-testops">Integration with Allure TestOps</a>
- <a href="#telegram">Integration with Telegram</a>

<a id="tools"></a>
## :computer: Stack of technologies
<code><img width="5%" title="IntelliJ IDEA" src="media/logo/Idea.svg"></code>
<code><img width="5%" title="Java" src="media/logo/Java.svg"></code>
<code><img width="5%" title="Junit5" src="media/logo/Junit5.svg"></code>
<code><img width="5%" title="Gradle" src="media/logo/Gradle.svg"></code>
<code><img width="5%" title="GitHub" src="media/logo/GitHub.svg"></code>
<code><img width="5%" title="Jenkins" src="media/logo/Jenkins.svg"></code>
<code><img width="5%" title="Allure Report" src="media/logo/Allure.svg"></code>
<code><img width="5%" title="Allure TestOps" src="media/logo/Allure_TO.svg"></code>
<code><img width="5%" title="Telegram" src="media/logo/Telegram.svg"></code>
<code><img width="5%" title="Selenoid" src="media/logo/Selenoid.svg"></code>
</p>

## Checks carried out:

- [x] 
- [x] 
- [x]

 
 <a id="console"></a>
## :computer: Running tests from the terminal
### Running tests locally

```
gradle clean test 
```

### Remote test run

```
gradle clean test 
"-Dbrowser=${browser}" 
"-DbrowserVersion=${browserVersion}" 
"-DbrowserSize=${browserSize}" 
"-DremoteUrl=${remoteUrl}"
"-DisRemote=true"
```



