$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/GSMArenaNews.feature");
formatter.feature({
  "line": 1,
  "name": "GSM Arena News testing",
  "description": "In order to use Cucumber in my project, I want to check how to test GSM Arena News page",
  "id": "gsm-arena-news-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "GSM Arena open page - passing",
  "description": "",
  "id": "gsm-arena-news-testing;gsm-arena-open-page---passing",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@demo"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on main page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I open \u0027News\u0027 page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "page \u0027News\u0027 should be open",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "page \u0027News\u0027 should contains all items",
  "keyword": "And "
});
formatter.match({
  "location": "GSMArenaNewsSteps.iAmOnMainPage()"
});
formatter.result({
  "duration": 726021300,
  "error_message": "org.openqa.selenium.WebDriverException: Requested environment is not available (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 109 milliseconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-Q7ODI2IC\u0027, ip: \u0027192.168.0.210\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.8\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.JsonWireProtocolResponse.lambda$errorHandler$0(JsonWireProtocolResponse.java:54)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)\r\n\tat java.base/java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:127)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:502)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:488)\r\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)\r\n\tat java.base/java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)\r\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.base/java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:543)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat com.qaprosoft.carina.core.foundation.webdriver.listener.EventFiringSeleniumCommandExecutor.execute(EventFiringSeleniumCommandExecutor.java:54)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat com.qaprosoft.carina.core.foundation.webdriver.core.factory.impl.DesktopFactory.create(DesktopFactory.java:126)\r\n\tat com.qaprosoft.carina.core.foundation.webdriver.core.factory.DriverFactory.create(DriverFactory.java:71)\r\n\tat com.qaprosoft.carina.core.foundation.webdriver.IDriverPool.createDriver(IDriverPool.java:511)\r\n\tat com.qaprosoft.carina.core.foundation.webdriver.IDriverPool.getDriver(IDriverPool.java:161)\r\n\tat com.qaprosoft.carina.core.foundation.webdriver.IDriverPool.getDriver(IDriverPool.java:96)\r\n\tat com.qaprosoft.carina.core.foundation.webdriver.IDriverPool.getDriver(IDriverPool.java:84)\r\n\tat com.qaprosoft.carina.demo.cucumber.steps.GSMArenaNewsSteps.iAmOnMainPage(GSMArenaNewsSteps.java:27)\r\n\tat ✽.Given I am on main page(src/test/resources/features/GSMArenaNews.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "GSMArenaNewsSteps.iOpenNewsPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GSMArenaNewsSteps.pageSettingsShouldBeOpen()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GSMArenaNewsSteps.pageSettingsShouldContainsAllItems()"
});
formatter.result({
  "status": "skipped"
});
});