package ch.silviowangler.grails

import grails.testing.gorm.DataTest
import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

/**
 * your description goes here...
 *
 * @author Silvio Wangler (silvio.wangler@onstructive.ch)
 */
class PersonServiceSpec extends Specification implements ServiceUnitTest<PersonService>, DataTest {

    Class[] getDomainClassesToMock() {
        [Person] as Class[]
    }

    void "Should run"() {
        expect:
        true
    }
}
