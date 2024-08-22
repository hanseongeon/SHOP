import { headers } from 'next/headers';
import { getAPI } from './AxiosAPI';

export const UserApi = getAPI();

export const getUser = async () => {
    const response = await UserApi.get('/api/user');
    return response.data;
};