import { WebPlugin } from '@capacitor/core';

import type { AndroidInsetsPlugin, BottomReturn, TopReturn } from './definitions';

export class AndroidInsetsWeb extends WebPlugin implements AndroidInsetsPlugin {
  async top(): Promise<TopReturn> {
    return { value: 0 };
  }

  async bottom(): Promise<BottomReturn> {
    return { value: 0 };
  }
}
