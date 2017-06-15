import { MyInvestMentAppPage } from './app.po';

describe('my-invest-ment-app App', () => {
  let page: MyInvestMentAppPage;

  beforeEach(() => {
    page = new MyInvestMentAppPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
